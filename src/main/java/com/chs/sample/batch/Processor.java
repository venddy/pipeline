package com.chs.sample.batch;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.chs.sample.model.Customer;

@Component
public class Processor implements ItemProcessor<Customer, Customer> {

  // private static final Map<String, String> DEPT_NAMES =
   //        new HashMap<>();

  //  public Processor() {
      // DEPT_NAMES.put("mr", "@");
      // DEPT_NAMES.put("MR", "#");
      // DEPT_NAMES.put("mrs", "$");
   // }

   // @Override
    public Customer process(Customer customer) throws Exception {
       // String deptCode = customer.getTitle();
       // String dept = DEPT_NAMES.get(deptCode);
       // customer.setTitle(dept);
       // customer.setTime(new Date());
       // System.out.println(String.format("Converted from [%s] to [%s]", deptCode, dept));
        return customer;
    }
}
