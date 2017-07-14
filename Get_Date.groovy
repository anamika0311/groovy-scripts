def date =new Date()
println "DATE="+date
def file= new File('today_date.properties')
file.write("DATE="+date)

