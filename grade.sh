# Create your grading script here



rm -rf student-submission
rm -rf error.txt
git clone $1 student-submission

CPATH=".:../lib/hamcrest-core-1.3.jar:../lib/junit-4.13.2.jar"
cd student-submission
if [ -e "ListExamples.java" ] 
then
    echo "You submit the correct file, points+1!"
else
    echo "Wrong file, please check your submission, no point earned"
    exit 1
fi

cd ..
cp TestListExamples.java student-submission/

cd student-submission

javac -cp $CLASSPATH *.java 2> error.txt

if [ $? -ne 0 ] 
then
    echo "You have compile error show below: "
    cat error.txt
    echo "You can not get scores from this part"
    exit 1
else
    echo "good job, point+1!"
fi
java -cp $CLASSPATH org.junit.runner.JUnitCore TestListExamples > testresult.txt
cat testresult.txt




