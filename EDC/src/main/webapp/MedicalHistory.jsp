<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Medical History</title>

	
	
<div class="back-button">
<button style="margin-left: 10px; margin-bottom: 10px; 
width: 150px;
height: 50px;
font-size: 20px;
padding: 30px 50px;
"

onclick="confirmDiscard()">Back</button>
</div>
	
</head>
<body>
<style>
	
	h1 {
			text-align: center;
		}
	
		form {
			width: 50%;
			margin: 0 auto;
			text-align: left;
			padding: 1em;
			border: 1px solid gray;
			border-radius: 10px;
		}
		label {
			width: 20%;
			display: inline-block;
			margin-bottom: 1em;
			font-weight: bold;
		}
		input[type="text"]{
			width: 60%;
			padding: 0.5em;
			margin-bottom: 1em;
			border-radius: 5px;
			border: 1px solid gray;
		}
		input[type="submit"] {
  background-color: #996600;
  color: white;
  padding: 14px 20px;
  border: none;
  border-radius: 5px;
  cursor: pointer;
  font-size: 16px;
  margin-top: 20px;
}

input[type="submit"]:hover {
  background-color: #996530;
}
	</style>
	<h1>Medical History</h1>
	<form action="MedicalHistoryServlet" method="post">
		<label for="physician-name">Name of Physician:</label>
		Dr. <input type="text" id="physician-name" name="physician-name">
		<br><br>
		
		<label for="specialty">Specialty, if applicable:</label>
		<input type="text" id="specialty" name="specialty">
		<br><br>
		
		<label for="office-address">Office Address:</label>
		<input type="text" id="office-address" name="office-address">
		<br><br>
		
		<label for="office-number">Office Number:</label>
		<input type="text" id="office-number" name="office-number">
		<br><br>
		
		<p>1.) Are you in good health?</p> 
		<input type="radio" id="health-yes" name="health" value="yes">
		<label for="health-yes">Yes</label>
		<input type="radio" id="health-no" name="health" value="no">
		<label for="health-no">No</label>
		<br><br>
		
		<p>2.) Are you under medical treatment now?</p>
		<input type="radio" id="treatment-yes" name="treatment" value="yes">
		<label for="treatment-yes">Yes</label>
		<input type="radio" id="treatment-no" name="treatment" value="no">
		<label for="treatment-no">No</label>
		<br><br>
		
		<div id="condition-input" style="display: none;">
			<label for="condition">If so, what is the condition being treated?</label>
			<input type="text" id="condition" name="treatment">
		</div>
		<br><br>
		
		<p>3. Have you ever had serious illness or surgical operation?</p>
		<input type="radio" id="serious-illness-yes" name="serious-illness" value="yes">
		<label for="serious-illness-yes">Yes</label>
		<input type="radio" id="serious-illness-no" name="serious-illness" value="no">
		<label for="serious-illness-no">No</label>
<br><br>

		<div id="illness-input" style="display: none;">
		<label for="illness-description">If so, what illness or operation?</label>
		<input type="text" id="illness-description" name="serious-illness">
		</div>
		<br><br>
		
		<p>4. Have you ever been hospitalized?</p>
		<input type="radio" id="hospitalized-yes" name="hospitalized" value="yes">
		<label for="hospitalized-yes">Yes</label>
		<input type="radio" id="hospitalized-no" name="hospitalized" value="no">
		<label for="hospitalized-no">No</label>
		<br><br>

		<div id="hospital-input" style="display: none;">
		<label for="hospital-description">If so, when and why?</label>
		<input type="text" id="hospital-description" name="hospitalized">
		</div>
		<br><br>		
		
		<p>5. Are you taking any prescription/non-prescription medication?</p>
		<input type="radio" id="medication-yes" name="medication" value="yes">
		<label for="medication-yes">Yes</label>
		<input type="radio" id="medication-no" name="medication" value="no">
		<label for="medication-no">No</label>
		<br><br>

		<div id="medication-input" style="display: none;">
		<label for="medication-description">If so, when and why?</label>
		<input type="text" id="medication-description" name="medication">
		</div>
		<br><br>
	
		<p>6. Do you use tobacco products?</p>
		<input type="radio" id="tobacco-yes" name="tobacco" value="yes">
		<label for="tobacco-yes">Yes</label>
		<input type="radio" id="tobacco-no" name="tobacco" value="no">
		<label for="tobacco-no">No</label>
		<br><br>

		<p>7. Do you use alcohol, cocaine or other dangerous drugs?</p>
		<input type="radio" id="drug-use-yes" name="drug-use" value="yes">
		<label for="drug-use-yes">Yes</label>
		<input type="radio" id="drug-use-no" name="drug-use" value="no">
		<label for="drug-use-no">No</label>
		<br><br>
		
		
		<p>8. Are you allergic to any of the following?</p>
		<label>
		<input type="checkbox" name="allergies[]" value="local-anesthetic">
		Local Anesthetic
		</label>
		<label>
		<input type="checkbox" name="allergies[]" value="penicillin-antibiotics">
		Penicillin Antibiotics
		</label>
		<label>
		<input type="checkbox" name="allergies[]" value="sulfa-drugs">
		Sulfa Drugs
		</label>
		<br>
		<label>
		<input type="checkbox" name="allergies[]" value="aspirin">
		Aspirin
		</label>
		<label>
		<input type="checkbox" name="allergies[]" value="latex">
		Latex
		</label>
		<label>
		<input type="checkbox" name="allergies[]" id="other-checkbox" value="other">
		Other
		</label>
		<br>
		<div id="other-input" style="display: none;">
			<label for="other-allergy">If so, please specify:</label>
			<input type="text" id="other-allergy" name="allergies[]">
		</div>
		
		<label for="bleeding-time">9.) Bleeding Time:</label>
		<input type="text" id="bleeding-time" name="bleeding-time" style="width: 60px;">
		<br><br>
		
		<label for="bleeding-time">10.) For Women Only:</label>
		<br><br>
		<label for="pregnant">Are you pregnant?</label>
		<input type="radio" id="pregnant-yes" name="pregnant" value="yes">
		<label for="pregnant-yes">Yes</label>
		<input type="radio" id="pregnant-no" name="pregnant" value="no">
		<label for="pregnant-no">No</label>
		<br><br>
		<label for="nursing">Are you nursing?</label>
		<input type="radio" id="nursing-yes" name="nursing" value="yes">
		<label for="nursing-yes">Yes</label>
		<input type="radio" id="nursing-no" name="nursing" value="no">
		<label for="nursing-no">No</label>
		<br><br>
		<label for="birth-control">Are you taking birth-control pills?</label>
		<input type="radio" id="birth-control-yes" name="birth-control" value="yes">
		<label for="birth-control-yes">Yes</label>
		<input type="radio" id="birth-control-no" name="birth-control" value="no">
		<label for="birth-control-no">No</label>
		<br><br>
		
		<label for="bleeding-time">11.) Blood Type:</label>
		<input type="text" id="blood-type" name="blood-type" style="width: 60px;">
		<br><br>
		
		<label for="bleeding-time">12.) Blood Pressure:</label>
		<input type="text" id="blood-pressure" name="blood-pressure" style="width: 100px;">
		<br><br>
		
		<label>13.) Do you have or have you had any of the following?</label>
<div>
  <input type="checkbox" id="high-blood-pressure" name="medical-condition" value="high-blood-pressure">
  <label for="high-blood-pressure">High Blood Pressure</label>

  <input type="checkbox" id="low-blood-pressure" name="medical-condition" value="low-blood-pressure">
  <label for="low-blood-pressure">Low Blood Pressure</label>

  <input type="checkbox" id="epilepsy" name="medical-condition" value="epilepsy">
  <label for="epilepsy">Epilepsy/Convulsions</label>

  <input type="checkbox" id="aids" name="medical-condition" value="aids">
  <label for="aids">AIDS or HIV Infection</label>
<br>
  <input type="checkbox" id="ulcers" name="medical-condition" value="ulcers">
  <label for="ulcers">Stomach Troubles/Ulcers</label>

  <input type="checkbox" id="seizures" name="medical-condition" value="seizures">
  <label for="seizures">Fainting Seizure</label>

  <input type="checkbox" id="rapid-weight-loss" name="medical-condition" value="rapid-weight-loss">
  <label for="rapid-weight-loss">Rapid Weight Loss</label>

  <input type="checkbox" id="radiation-therapy" name="medical-condition" value="radiation-therapy">
  <label for="radiation-therapy">Radiation Therapy</label>
<br>
  <input type="checkbox" id="joint-replacement" name="medical-condition" value="joint-replacement">
  <label for="joint-replacement">Joint Replacement/Implant</label>

  <input type="checkbox" id="heart-surgery" name="medical-condition" value="heart-surgery">
  <label for="heart-surgery">Heart Surgery</label>

  <input type="checkbox" id="heart-attack" name="medical-condition" value="heart-attack">
  <label for="heart-attack">Heart Attack</label>

  <input type="checkbox" id="thyroid-problem" name="medical-condition" value="thyroid-problem">
  <label for="thyroid-problem">Thyroid Problem</label>
<br>
  <input type="checkbox" id="heart-disease" name="medical-condition" value="heart-disease">
  <label for="heart-disease">Heart Disease</label>

  <input type="checkbox" id="heart-murmur" name="medical-condition" value="heart-murmur">
  <label for="heart-murmur">Heart Murmur</label>

  <input type="checkbox" id="hepatitis" name="medical-condition" value="hepatitis">
  <label for="hepatitis">Hepatitis/Liver Disease</label>

  <input type="checkbox" id="rheumatic-fever" name="medical-condition" value="rheumatic-fever">
  <label for="rheumatic-fever">Rheumatic Fever</label>
<br>
  <input type="checkbox" id="hay-fever" name="medical-condition" value="hay-fever">
  <label for="hay-fever">Hay Fever/Allergies</label>

  <input type="checkbox" id="respiratory-problems" name="medical-condition" value="respiratory-problems">
  <label for="respiratory-problems">Respiratory Problems</label>
  
	<input type="checkbox" id="hepatitis" name="medical-condition" value="Hepatitis/Jaundice">
	<label for="hepatitis">Hepatitis/Jaundice</label>

	<input type="checkbox" id="tuberculosis" name="medical-condition" value="Tuberculosis">
	<label for="tuberculosis">Tuberculosis</label>
<br>

<input type="checkbox" id="swollen-ankles" name="medical-condition" value="Swollen Ankles">
<label for="swollen-ankles">Swollen Ankles</label>

<input type="checkbox" id="kidney-disease" name="medical-condition" value="Kidney Disease">
<label for="kidney-disease">Kidney Disease</label>

<input type="checkbox" id="diabetes" name="medical-condition" value="Diabetes">
<label for="diabetes">Diabetes</label>

<input type="checkbox" id="chest-pain" name="medical-condition" value="Chest Pain">
<label for="chest-pain">Chest Pain</label>

<br>
<input type="checkbox" id="stroke" name="medical-condition" value="Stroke">
<label for="stroke">Stroke</label>

<input type="checkbox" id="cancer-tumors" name="medical-condition" value="Cancer Tumors">
<label for="cancer-tumors">Cancer Tumors</label>

<input type="checkbox" id="anemia" name="medical-condition" value="Anemia">
<label for="anemia">Anemia</label>

<input type="checkbox" id="angina" name="medical-condition" value="Angina">
<label for="angina">Angina</label>
<br>
<input type="checkbox" id="asthma" name="medical-condition" value="Asthma">
<label for="asthma">Asthma</label>

<input type="checkbox" id="emphysema" name="medical-condition" value="Emphysema">
<label for="emphysema">Emphysema</label>

<input type="checkbox" id="bleeding-problems" name="medical-condition" value="Bleeding Problems">
<label for="bleeding-problems">Bleeding Problems</label>

<input type="checkbox" id="blood-disease" name="medical-condition" value="Blood Disease">
<label for="blood-disease">Blood Disease</label>
<br>
<input type="checkbox" id="head-injuries" name="medical-condition" value="Head Injuries">
<label for="head-injuries">Head Injuries</label>

<input type="checkbox" id="arthritis-rheumatism" name="medical-condition" value="Arthritis/Rheumatism">
<label for="arthritis-rheumatism">Arthritis/Rheumatism</label>

<input type="checkbox" id="other" name="medical-condition" value="Other">
<label for="other">Other</label>
<br>

</div>
		<input type="submit" value="Next (Intraoral Examination)">
	</form>
	
	<script>
		const treatmentYes = document.getElementById("treatment-yes"); //question 2
		const conditionInput = document.getElementById("condition-input");
		treatmentYes.addEventListener("click", function() {
			conditionInput.style.display = "block";
		});
		const treatmentNo = document.getElementById("treatment-no");
		treatmentNo.addEventListener("click", function() {
			conditionInput.style.display = "none";
		});
		
		const illnessInput = document.getElementById("illness-input"); //question 3
		const illnessRadioYes = document.getElementById("serious-illness-yes");
		const illnessRadioNo = document.getElementById("serious-illness-no");

		illnessRadioYes.addEventListener("click", function() {
		illnessInput.style.display = "block";
		});

		illnessRadioNo.addEventListener("click", function() {
		illnessInput.style.display = "none";
		});
		
		const hospitalInput = document.getElementById("hospital-input"); //question 4
		const hospitalizedRadioYes = document.getElementById("hospitalized-yes");
		const hospitalizedRadioNo = document.getElementById("hospitalized-no");

		hospitalizedRadioYes.addEventListener("change", function() {
    hospitalInput.style.display = "block";
		});

		hospitalizedRadioNo.addEventListener("change", function() {
		hospitalInput.style.display = "none";
		});
		
		const medicationInput = document.getElementById("medication-input");
		const medicationRadioYes = document.getElementById("medication-yes");
		const medicationRadioNo = document.getElementById("medication-no");

		medicationRadioYes.addEventListener("change", function() { //question 5
		medicationInput.style.display = "block";
		});

		medicationRadioNo.addEventListener("change", function() {
		medicationInput.style.display = "none";
		});
		
		const otherCheckbox = document.getElementById("other-checkbox"); //question 8
		const otherInput = document.getElementById("other-input");

		otherCheckbox.addEventListener("change", function() {
		if (otherCheckbox.checked) {
			otherInput.style.display = "block";
		} else {
			otherInput.style.display = "none";
		}
});

		function confirmDiscard() {
  if (confirm("Do you want to discard changes?")) {
    window.location.href = "CreatePxForm.jsp";
  }
}
	</script>
</body>
</html>