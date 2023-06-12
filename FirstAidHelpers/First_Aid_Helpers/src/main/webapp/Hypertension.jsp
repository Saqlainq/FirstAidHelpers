<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <title>Checklist Form</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
      margin: 0;
      padding: 0;
    }
    .container {
      width: 400px;
      padding: 20px;
      text-align: center;
      background-color: lightgray;
      border-radius: 10px;
    }
    h1 {
      font-size: 24px;
      margin-bottom: 20px;
    }
    form {
      text-align: left;
    }
    label {
      font-size: 18px;
    }
    button {
      font-size: 18px;
      padding: 10px 20px;
      background-color: #4CAF50;
      color: white;
      border: none;
      border-radius: 5px;
      cursor: pointer;
    }
    #riskMessage {
      font-size: 20px;
      margin-top: 20px;
    }
  </style>
</head>
<body>
  <div class="container">
    <h1>Checklist Form</h1>
    <form>
      <input type="checkbox" name="item1" id="item1">
      <label for="item1">Your are having a headache?</label><br>

      <input type="checkbox" name="item2" id="item2">
      <label for="item2">Are you facing Vision problems?</label><br>

      <input type="checkbox" name="item3" id="item3">
      <label for="item3">Your Nose is Bleeding?</label><br>

      <input type="checkbox" name="item4" id="item4">
      <label for="item4">Are you feeling Dizzy?</label><br>

      <input type="checkbox" name="item5" id="item5">
      <label for="item5">Is there any pain in your Chest?</label><br>

      <button type="button" onclick="checkRisk()">Submit</button>
    </form>

    <h1 id="riskMessage"></h1>
  </div>

  <script>
    function checkRisk() {
      const checkboxes = document.querySelectorAll('input[type="checkbox"]:checked');
      const riskMessage = document.getElementById('riskMessage');
      if (checkboxes.length >= 3) {
        riskMessage.textContent = 'You are at risk of HyperTension. Book an appointment with our Doctors.';
      } else {
        riskMessage.textContent = 'Touchwood ,You are not at risk of Hypertension';
      }
    }
  </script>
</body>
</html>