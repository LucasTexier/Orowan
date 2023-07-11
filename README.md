### **OROWAN PROJECT**

# Introduction

Orowan is a project to develop a Java interface that meets specifications issued by Arcelor Mittal. This was achieved as part of my second year of engineering school studies at the Ecole des Mines d'Alès.

# Goal of the project

The school provided us with an internal .exe to the company which takes as input a table and output a new table with the calculation of purely physical coefficients (friction, correlation...). A simple rights management system was in place in the project.

# Front-end

The front had to be an Java interface which displays all outputs information for each machines. The machines were simulated by differents inputs.
The front directly red the Excels created by the Back-end and interfaces was done with Javafx.

# Back-end

First, the back imported data from a H2 base (it is a local database). Then, datas were used in the Orowan executable and the outputs were stocked in the local database H2 again.


# Why a repository so poor ...

The project was evaluated during a defense in front of a jury on his own computer. Thus, locally we had our H2 database. To reuse this project, it would have been necessary to rebuild all the tables of the databases. In addition, in the absence of indication on the confidentiality of the data and the executable provided, only the Java code has been put on the github but remains unusable without the rest of the folders (connectors, dependencies...).
