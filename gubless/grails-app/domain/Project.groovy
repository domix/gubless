class Project {
	static transients = ["status"]
	static hasMany=[members:Person, issues:Issue, versions:Version, components:Component]
	
	StatusProject status
	
}
