CREATE TABLE Poststed(
	postnummer CHAR(4),
	poststed VARCHAR(55),
	CONSTRAINT PoststedPK PRIMARY KEY(poststed)
);

CREATE TABLE Person(
	personid INTEGER NOT NULL,
	navn VARCHAR(55) NOT NULL,
	postnummer INTEGER NOT NULL ON UPDATE CASCADE ON DELETE SET NULL,
	adresse VARCHAR(55),
	telefonnummer CHAR(8),
	CONSTRAINT PersonPK PRIMARY KEY(personid),
	CONSTRAINT PersonFK FOREIGN KEY(postnummer) REFERENCES Poststed(postnummer)
);

ALTER TABLE Person
ADD COLUMN epost-adresse VARCHAR(55);

ALTER TABLE Person
DROP COLUMN telefonnummer;

SELECT navn, postnummer, Poststed.poststed FROM Person
LEFT OUTER JOIN Poststed ON Person.postnummer = Poststed.postnummer;

SELECT navn, postnummer, Poststed.poststed FROM Person
INNER JOIN Poststed ON Person.postnummer = Poststed.postnummer;

SELECT postnummer, poststed, COUNT(Person.*) FROM Poststed
LEFT OUTER JOIN Poststed ON Person.postnummer = Poststed.postnummer
GROUP BY postnummer, poststed;