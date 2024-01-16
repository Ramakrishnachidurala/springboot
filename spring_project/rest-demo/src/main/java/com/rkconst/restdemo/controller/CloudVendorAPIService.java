package com.rkconst.restdemo.controller;
import com.rkconst.restdemo.model.CloudVendor;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService  {

    CloudVendor cloudVendor;

  @GetMapping({"{vendorId}"})
    public CloudVendor getCloudVendor(String vendorId){
        return cloudVendor;
      //  return new CloudVendor("a1", "rk","wgl","90999");
   } 

    @PostMapping
    public String crearevendor(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor=cloudVendor;
        return "Successfully created vendor";
    }

     @PutMapping    
    public String Updatecrearevendor(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor=cloudVendor;
        return "Successfully updated vendor";
    }
    
    @DeleteMapping("{vendorId}")
    public String deletevendor(String vendorId)
    {
        this.cloudVendor=null;
        return "Successfully deleted vendor";
    }
    
}
 