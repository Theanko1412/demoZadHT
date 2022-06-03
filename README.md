# Shipment Tracking API 1.14.0 

Base URL: localhost:8017/shipmentTracking/v1

Shipment Tracking Management provides operations to track shipments.


## Available endpoints:
**GET**
- /shipmentTracking
- /shipmentTracking/{id}
- /shipmentTracking/status/{status}
- /shipmentTracking/date/{date1}/{date2}   (*dateformat = YYYY-MM-DD*)

**POST**
- /shipmentTracking

**PATCH**
- /shipmentTracking/{id}


### Komentari
- modeli možda nisu pravilo spojeni kako bi u stvarnom sustavu trebali, uglavnom su samo OneToOne ili OneToMany kako bi aplikacija radila pravilno
- napravljen je dohvat podataka preko statusa(enum) na endpointu /shipmentTracking/status/{status}
- napravljen je dohvat podataka sa složenim kriterijem između dva datuma /shipmentTracking/date/{date1}/{date2} (date1 < date2)
- na kontolerima nisu dodani posebni uvjeti provjere niti posebne poruke za razlicite response kodove
- baza je postavljena kao lokalna postgresql baza na portu 5432 sa imenom "test"
- u data.sql fileu je ubaceno par tablica radi testiranja sustava


**Danko Čurlin**
