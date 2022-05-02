import { Geo } from "./geo";

export class Address {
street: string | undefined;
suite: string | undefined;
city: string | undefined;
zipcode: string | undefined;
geo:Geo | undefined;
}
