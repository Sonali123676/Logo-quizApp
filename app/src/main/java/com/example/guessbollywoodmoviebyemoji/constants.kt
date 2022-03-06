package com.example.guessbollywoodmoviebyemoji

object constants {
    const val USER_NAME :String = "user_name"
    const val Total_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = " Correct_answers"
    fun getQuestions():ArrayList<Questions>{

        val questionsList = ArrayList<Questions>()
        val ques1 = Questions(
            1,
            "Which logo is shown below?",
            R.drawable.logo1,
            "KFC","Belgian Fries",
            "Wendy","Burger King",
            1

        )
        questionsList.add(ques1)
        val ques2 = Questions(
            2,
            "Which logo is shown below?",
            R.drawable.logo2,
            "Volkswagen","Honda",
            "Toyota","Hyundai",
            3

        )
        questionsList.add(ques2)
        val ques3 = Questions(
            3,
            "Which logo is shown below?",
            R.drawable.logo3,
            "Balloons and Ribbons","Belgian Fries",
            "Buskin Robbins","Baskin Robbins",

            4

        )
        questionsList.add(ques3)
        val ques4 = Questions(
            4,
            "Which logo is shown below?",
            R.drawable.logo4,
            "Ajio","American Express",
            "Amazon","American Tourister",
            3

        )
        questionsList.add(ques4)
        val ques5 = Questions(
            5,
            "Which logo is shown below?",
            R.drawable.logo5,
            "big basket","Big Brothers",
            "big bazaar","Big Boss",
            1

        )
        questionsList.add(ques5)
        val ques6 = Questions(
            6,
            "Which logo is shown below?",
            R.drawable.logo6,
            "bird","twitter",
            "skype","cloud meeting",

            2


        )
        questionsList.add(ques6)
        val ques7 = Questions(
            7,
            "Which logo is shown below?",
            R.drawable.logo7,
            "Tinder","Microsoft Teams",
            "Tendy","Truecaller",
            2

        )
        questionsList.add(ques7)
        val ques8 = Questions(
            8,
            "Which logo is shown below?",
            R.drawable.logo8,
            "JioMeet","Google Duo",
            "Zoom","Skype",
            2

        )
        questionsList.add(ques8)
        val ques9 = Questions(
            9,
            "Which logo is shown below?",
            R.drawable.logo10,
            "Dominos","Pizza hut",
            "Urban Clap","KFC",
            2

        )
        questionsList.add(ques9)
        val ques10 = Questions(
            10,
            "Which logo is shown below?",
            R.drawable.logo9,           "pickles","pringles",
            "bakeryKing","nachos",
            2

        )
        questionsList.add(ques10)
        val ques11 = Questions(
            11,
            "Which logo is shown below?",
            R.drawable.logo11,
            "Jingle bell","Cream Bell",
            "Taco Bell","RingBell",
            3

        )
        questionsList.add(ques11)
        val ques12 = Questions(
            12,
            "Which logo is shown below?",
            R.drawable.logo12,
            "Chef","Shell",
            "Hat","King Fisher",
            2

        )
        questionsList.add(ques12)
        val ques13 = Questions(
            13,
            "Which logo is shown below?",
            R.drawable.logo14,
            "Porsche","Ferrari",
            "Bugatti","Lamborghini",
            1

        )
        questionsList.add(ques13)
        val ques14 = Questions(
            14,
            "Which logo is shown below?",
            R.drawable.logo13,
            "porsche","jaguar",
            "Ferrari","Lamborghini",
            3

        )
        questionsList.add(ques14)

        return questionsList






    }
}