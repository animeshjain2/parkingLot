Ability to create a ticket
Task:

- Make GenerateTicketRequestDto only take entry_gate_id and vehicle_type and vehicle_number
  -> Save the vehicle in the database (VehicleRepository)
  -> Fetch the Gate with that Id (EntryGateRepository)
- Implement GenerateBill
   ->Implement FeesCalculatorStrategy
   ->Store the bill in the database (BillRepository)

BillController
BillService
