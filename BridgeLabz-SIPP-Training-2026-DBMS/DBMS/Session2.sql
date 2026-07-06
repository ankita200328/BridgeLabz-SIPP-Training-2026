select * from covidIndia;

--Task 1 : Set a default value of 0 for the Recoveries column and set the current system timestamp as the default value for the Last_Updated column.

ALTER TABLE covidIndia
ADD Recoveries INT,
    Last_Updated DATETIME;


ALTER TABLE covidIndia
ADD CONSTRAINT DF_covidIndia_Recoveries
DEFAULT 0 FOR Recoveries;

ALTER TABLE covidIndia
ADD CONSTRAINT DF_covidIndia_LastUpdated
DEFAULT CURRENT_TIMESTAMP FOR Last_Updated

--Task 2 : Create a UNIQUE constraint on the Country and Date columns to prevent multiple records for the same country on the same reporting date.

ALTER TABLE covidIndia
ADD CONSTRAINT UQ_covidIndia_State_Date
UNIQUE (State_UnionTerritory, Date);

SELECT State_UnionTerritory,
       Date,
       COUNT(*) AS DuplicateCount
FROM covidIndia
GROUP BY State_UnionTerritory, Date
HAVING COUNT(*) > 1;