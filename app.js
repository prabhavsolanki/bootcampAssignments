// Question 1
function promptQues1() {
  var amount = parseFloat(prompt("Enter amount"));
  var rate = parseFloat(prompt("Enter Interest rate"));
  var year = parseFloat(prompt("Enter number of years"));

  calSI(amount, rate, year);
}

function calSI(amount, rate, year) {
  document.querySelector("#amount").innerHTML = "Amount: " + amount;
  document.querySelector("#rate").innerHTML = "Interest rate: " + rate;
  document.querySelector("#year").innerHTML = "Number of years: " + year;

  var SI = (amount * rate * year) / 100;
  var si = document.querySelector("#si");
  si.innerHTML = "Simple Interest: " + SI;
}

// Question 2
function promptQues2() {
  var str = prompt("Enter a string");
  checkPalindrome(str);
}

function checkPalindrome(str) {
  lowerStr = str.toLowerCase();
  splitArray = lowerStr.split("");
  reverseArray = splitArray.reverse();
  reverseStr = reverseArray.join("");
  var palindrome = document.querySelector("#palindrome");
  if (lowerStr === reverseStr) {
    palindrome.innerHTML = str + " is a palindromic string";
  } else {
    palindrome.innerHTML = str + " is not a palindromic string";
  }
}

// Question 3
function promptQues3() {
  var radius = parseFloat(prompt("Enter radius of the circle (in cm)"));
  calArea(radius);
}

function calArea(radius) {
  var area = 3.14 * radius * radius;
  document.querySelector("#area").innerHTML =
    "Area of circle with radius " + radius + "cm = " + area + "cm<sup>2<sup>";
}

// Question 4
function ques4() {
  var audi = {
    model: "a7",
    colors: ["black", "white", "maroon", "blue"],
    transmission: ["automatic", "manual"],
    willFloat: function(value = false) {
      return value;
    },
    willDrive: function(value = true) {
      return value;
    }
  };

  console.log("Audi (original object): ", audi);

  var yatch = JSON.parse(JSON.stringify(audi));
  yatch.model = "floater";
  yatch.willFloat = true;
  yatch.willDrive = false;
  yatch.transmission.pop();

  console.log("Yatch (copied object): ", yatch);

  document.querySelector("#obj").innerHTML = "Please check the console";
}

// Question 5
var employees = [
  {
    Name: "Syed Shayan Nasir",
    Age: 23,
    Salary: 15000,
    DOB: "20/05/1995"
  },
  {
    Name: "Ammar Alam",
    Age: 22,
    Salary: 15000,
    DOB: "24/05/1997"
  },
  {
    Name: "Rishabh Gupta",
    Age: 22,
    Salary: 200,
    DOB: "13/12/1998"
  },
  {
    Name: "Fahad Khan",
    Age: 25,
    Salary: 200,
    DOB: "14/08/1995"
  },
  {
    Name: "Kaushlendra Sign",
    Age: 23,
    Salary: 200,
    DOB: "25/01/1993"
  }
];

// Question 5a
function viewEmployees() {
  document.querySelector("#employees").innerHTML = "Please check the console";
  console.log(JSON.stringify(employees));
}

// Question 5b
function checkSalary() {
  var result = document.querySelector("#salary");

  var data = [];
  data = employees.filter(function(item) {
    return item.Salary > 5000;
  });
  for (var i = 0; i < data.length; i++) {
    if (result.innerHTML == "") result.innerHTML = data[i].Name;
    else result.innerHTML = result.innerHTML + ", " + data[i].Name;
  }
}

// Question 5c
function groupByAge() {
  result = employees.reduce(function(r, a) {
    r[a.Age] = r[a.Age] || [];
    r[a.Age].push(a);
    return r;
  }, Object.create(null));
  console.log("Employees grouped by their ages: ", result);
  document.querySelector("#age").innerHTML = "Please check the console";
}

// Question 5d
function fetch() {
  var data = [];
  data = employees.filter(function(item) {
    return item.Salary < 1000 && item.Age > 20;
  });

  data.forEach(function(item) {
    item.Salary = item.Salary + item.Salary * 5;
  });
  console.log("Employees with updated salaries: ", data);
  document.querySelector("#fetch").innerHTML = "Please check the console";
}
