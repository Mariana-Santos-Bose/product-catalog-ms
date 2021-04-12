# Hello GDS Backend

Demo service for GDS backend microservices.

## Development and validation
Using following commands you can validate the outcome of this chart without apply it to a cluster

```
helm dependency update
helm template .
helm install hellogds-backend . --set global.application.name=hellgds-backend --set global.application.version=0.0.0 --set global.application.context=v0 --set global.cluster.env=local --dry-run  
```

## Endpoints

/ - return HttpStatus.OK