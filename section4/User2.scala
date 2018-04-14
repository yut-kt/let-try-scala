class User(val id: Long, val firstname: String, val lastname: String, val fullname:Fullname = new Fullname) {
  def getFullname() = this.fullname.get(firstname, lastname)
}

class Fullname() {
  def get(firstname: String, lastname: String) = firstname + " " + lastname
}

class FullnameInJapan() extends Fullname {
  override def get(firstname: String, lastname: String) = lastname + " " + firstname
}

val user1 = new User(1, "源次", "富樫", new FullnameInJapan)
println(user1.getFullname())

val user2 = new User(2, "鯛雄", "松尾")
println(user2.getFullname())
