Ability to create a ticket -

Task:

- Make GenerateTicketRequestDto only take entry_gate_id and vehicle_type and vehicle_number.
     - Save the vehicle in the database (VehicleRepository)
     - Fetch the Gate with that Id (EntryGateRepository)
- Implement GenerateBill
   - Implement FeesCalculatorStrategy
   - Store the bill in the database (BillRepository)

- BillController
- BillService


Reference doc :
https://docs.google.com/document/d/12lmKaxr00jZiX2amYVPpmR6C86A70sCWmnIBUOuvdQY/edit?usp=sharing