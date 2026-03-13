# AI-Interview-Assistant
#AI based interview preparation tool built with Python.  It helps users practice technical interview questions based on their skills.
skills = input("Enter your skill: ")

questions = {
"python":"What is list comprehension?",
"java":"What is JVM?",
"data analyst":"What is data cleaning?"
}

if skills.lower() in questions:
    print("Interview Question:")
    print(questions[skills.lower()])
else:
    print("Skill not found. Try Python, Java, Data Analyst")
