get '/students' do
  @students = Student.all()
  erb(:"students/index")
end

get '/students/new' do
  @students = Student.all()
  erb(:"students/new")
end

post '/students' do
  @students = Student.new(params)
  @students.save()
  redirect('/students')
end
