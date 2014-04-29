#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------


CREATE TABLE materielRoulant(
        id                   Varchar (30) NOT NULL ,
        marque               Varchar (30) NOT NULL ,
        type                 Varchar (30) NOT NULL ,
        anneedeconstruction  Date ,
        carburant            Varchar (30) NOT NULL ,
        numimmatr            Int ,
        nbdeplaces           Int NOT NULL ,
        kmactuel             Int NOT NULL ,
        validiterexctincteur Date ,
        PRIMARY KEY (id )
)ENGINE=InnoDB;


CREATE TABLE chauffeur(
        idchauffeur             Varchar (15) NOT NULL ,
        nom                     Varchar (30) ,
        prenom                  Varchar (30) NOT NULL ,
        datenaissance           Date NOT NULL ,
        adresse                 Varchar (40) NOT NULL ,
        codepostal              Int ,
        ville                   Varchar (30) NOT NULL ,
        numtelephone            Int NOT NULL ,
        email                   Varchar (30) ,
        selectionmedicale       Date NOT NULL ,
        validitercartechauffeur Date NOT NULL ,
        validitercap            Date NOT NULL ,
        PRIMARY KEY (idchauffeur )
)ENGINE=InnoDB;


CREATE TABLE eleve(
        ideleve          Varchar (30) NOT NULL ,
        nomeleve         Varchar (30) ,
        prenomeleve      Varchar (30) ,
        datedenaissance  Date ,
        adresseeleve     Varchar (40) NOT NULL ,
        codepostal       Int ,
        ville            Varchar (30) ,
        nomresponsable   Varchar (30) NOT NULL ,
        telresponsable   Int NOT NULL ,
        emailresponsable Varchar (30) ,
        idcircuit        Int NOT NULL ,
        idecole          Int NOT NULL ,
        PRIMARY KEY (ideleve )
)ENGINE=InnoDB;


CREATE TABLE heureDeTravail(
        idheuredetravail Int NOT NULL ,
        heurededebut     Varchar (10) NOT NULL ,
        heuredefin       Varchar (10) NOT NULL ,
        datetravail      Date,
        PRIMARY KEY (idheuredetravail )
)ENGINE=InnoDB;


CREATE TABLE utilisationCarte(
        idutilisation   int (11) Auto_increment  NOT NULL ,
        dateutilisation Date ,
        PRIMARY KEY (idutilisation )
)ENGINE=InnoDB;


CREATE TABLE documentsAdministratifs(
        iddocument    int (11) Auto_increment  NOT NULL ,
        libelle       Varchar (30) ,
        datevaliditer Date NOT NULL ,
        id            Varchar (30) NOT NULL ,
        idchauffeur   Varchar (15) NOT NULL ,
        PRIMARY KEY (iddocument )
)ENGINE=InnoDB;


CREATE TABLE circuit(
        idcircuit   int (11) Auto_increment  NOT NULL ,
        nomcircuit  Varchar (30) NOT NULL ,
        tempsprevu  Varchar (20) NOT NULL ,
        kmdepart    Int NOT NULL ,
        kmfin       Int NOT NULL ,
        datecircuit Date ,
        PRIMARY KEY (idcircuit )
)ENGINE=InnoDB;


CREATE TABLE entretien(
        identretien     int (11) Auto_increment  NOT NULL ,
        description     Varchar (30) ,
        kmentretienfait Int NOT NULL ,
        dateentretien   Date NOT NULL ,
        id              Varchar (30) NOT NULL ,
        PRIMARY KEY (identretien )
)ENGINE=InnoDB;


CREATE TABLE carteCarburant(
        idcarte        int (11) Auto_increment  NOT NULL ,
        kmutilisation  Int ,
        litrecarburant Int NOT NULL ,
        PRIMARY KEY (idcarte )
)ENGINE=InnoDB;


CREATE TABLE ecole(
        idecole       int (11) Auto_increment  NOT NULL ,
        nomecole      Varchar (30) NOT NULL ,
        adresseecole  Varchar (30) NOT NULL ,
        cdpostal      Int NOT NULL ,
        vil           Varchar (30) NOT NULL ,
        telecole      Int NOT NULL ,
        emailecole    Varchar (30) ,
        nomdirecteur  Varchar (30) ,
        anneescolaire Int NOT NULL ,
        PRIMARY KEY (idecole )
)ENGINE=InnoDB;


CREATE TABLE arrets(
        idarrets      int (11) Auto_increment  NOT NULL ,
        adressearrets Varchar (40) NOT NULL ,
        PRIMARY KEY (idarrets )
)ENGINE=InnoDB;


CREATE TABLE mr_utilisation(
        id            Varchar (30) NOT NULL ,
        idutilisation Int NOT NULL ,
        PRIMARY KEY (id ,idutilisation )
)ENGINE=InnoDB;


CREATE TABLE utiliser(
        idchauffeur Varchar (15) NOT NULL ,
        id          Varchar (30) NOT NULL ,
        PRIMARY KEY (idchauffeur ,id )
)ENGINE=InnoDB;


CREATE TABLE carburant_utilisation(
        idutilisation Int NOT NULL ,
        idcarte       Int NOT NULL ,
        PRIMARY KEY (idutilisation ,idcarte )
)ENGINE=InnoDB;


CREATE TABLE esteffectuer(
        idchauffeur Varchar (15) NOT NULL ,
        idcircuit   Int NOT NULL ,
        PRIMARY KEY (idchauffeur ,idcircuit )
)ENGINE=InnoDB;


CREATE TABLE contient(
        idcircuit Int NOT NULL ,
        idarrets  Int NOT NULL ,
        PRIMARY KEY (idcircuit ,idarrets )
)ENGINE=InnoDB;


CREATE TABLE atravailler(
        idheuredetravail Int NOT NULL ,
        idchauffeur      Varchar (15) NOT NULL ,
        PRIMARY KEY (idheuredetravail ,idchauffeur )
)ENGINE=InnoDB;

ALTER TABLE eleve ADD CONSTRAINT FK_eleve_idcircuit FOREIGN KEY (idcircuit) REFERENCES circuit(idcircuit);
ALTER TABLE eleve ADD CONSTRAINT FK_eleve_idecole FOREIGN KEY (idecole) REFERENCES ecole(idecole);
ALTER TABLE documentsAdministratifs ADD CONSTRAINT FK_documentsAdministratifs_id FOREIGN KEY (id) REFERENCES materielRoulant(id);
ALTER TABLE documentsAdministratifs ADD CONSTRAINT FK_documentsAdministratifs_idchauffeur FOREIGN KEY (idchauffeur) REFERENCES chauffeur(idchauffeur);
ALTER TABLE entretien ADD CONSTRAINT FK_entretien_id FOREIGN KEY (id) REFERENCES materielRoulant(id);
ALTER TABLE mr_utilisation ADD CONSTRAINT FK_mr_utilisation_id FOREIGN KEY (id) REFERENCES materielRoulant(id);
ALTER TABLE mr_utilisation ADD CONSTRAINT FK_mr_utilisation_idutilisation FOREIGN KEY (idutilisation) REFERENCES utilisationCarte(idutilisation);
ALTER TABLE utiliser ADD CONSTRAINT FK_utiliser_idchauffeur FOREIGN KEY (idchauffeur) REFERENCES chauffeur(idchauffeur);
ALTER TABLE utiliser ADD CONSTRAINT FK_utiliser_id FOREIGN KEY (id) REFERENCES materielRoulant(id);
ALTER TABLE carburant_utilisation ADD CONSTRAINT FK_carburant_utilisation_idutilisation FOREIGN KEY (idutilisation) REFERENCES utilisationCarte(idutilisation);
ALTER TABLE carburant_utilisation ADD CONSTRAINT FK_carburant_utilisation_idcarte FOREIGN KEY (idcarte) REFERENCES carteCarburant(idcarte);
ALTER TABLE esteffectuer ADD CONSTRAINT FK_esteffectuer_idchauffeur FOREIGN KEY (idchauffeur) REFERENCES chauffeur(idchauffeur);
ALTER TABLE esteffectuer ADD CONSTRAINT FK_esteffectuer_idcircuit FOREIGN KEY (idcircuit) REFERENCES circuit(idcircuit);
ALTER TABLE contient ADD CONSTRAINT FK_contient_idcircuit FOREIGN KEY (idcircuit) REFERENCES circuit(idcircuit);
ALTER TABLE contient ADD CONSTRAINT FK_contient_idarrets FOREIGN KEY (idarrets) REFERENCES arrets(idarrets);
ALTER TABLE atravailler ADD CONSTRAINT FK_atravailler_idheuredetravail FOREIGN KEY (idheuredetravail) REFERENCES heureDeTravail(idheuredetravail);
ALTER TABLE atravailler ADD CONSTRAINT FK_atravailler_idchauffeur FOREIGN KEY (idchauffeur) REFERENCES chauffeur(idchauffeur);
