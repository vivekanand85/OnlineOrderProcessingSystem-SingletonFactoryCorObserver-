Design an Online Order Processing System with the following requirements:
1. The system must have only one Logger instance used across the application.
2. The system should support different order types:
○ FoodOrder
○ ElectronicOrder
These orders must be created using a Factory Pattern.

3. Every order must pass through a validation chain:
○ Payment Validation
○ Stock Validation
○ Delivery Validation
4. When an order is successfully placed, all subscribed users must be notified using the
Observer Pattern.
