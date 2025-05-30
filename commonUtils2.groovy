return [
    analyzeName: { fullName ->
        def parts = fullName.trim().split(/\s+/)
        def firstName = parts[0]
        def lastName = parts[-1]
        def initials = parts.collect { it[0].toUpperCase() }.join(".") + "."
        def reversed = parts.reverse().join(" ")
        
        return [
            firstName: firstName,
            lastName: lastName,
            initials: initials,
            wordCount: parts.size(),
            uppercased: fullName.toUpperCase(),
            reversed: reversed
        ]
    }
]
