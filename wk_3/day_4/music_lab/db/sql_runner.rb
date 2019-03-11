require('pg')


# dont need to initialize this as nothing wil be passed in
class SqlRunner

 # this first line means that if values is not given an argument, then it will be equal to an empty array. This will only really be applicable for the delete_all
  def self.run(sql, values = [])
    begin
      db = PG.connect({dbname: 'music', host: 'localhost'})
      db.prepare("query", sql)
      result = db.exec_prepared("query", values)
    ensure
      db.close() if db != nil
    end
    return result
  end





end
