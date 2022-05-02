import { Address } from "./address";
import { Company } from "./company";

export class Student {
  id:number | undefined;
  name:string | undefined;
  username:string | undefined;
  email:string|undefined;
  address:Address | undefined;
  phone:string | undefined;
  website:string | undefined;
  company:Company | undefined
}
