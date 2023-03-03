def import __main__
class Main ( object ) :
    def __init__ ( self , t , d ) :
        self.t = t
        self.d = d
    def __init__ ( self , t , d ) :
        self.t = t
        self.d = d
    def __init__ ( self , t , d ) :
        self.t = t
        self.d = d
    def __init__ ( self , t , d ) :
        self.t = t
        self.d = d
    def __init__ ( self , t , d ) :
        self.t = t
        self.d = d
    sushis = [ ]
    for i in range ( N ) :
        t = self.t
        self.d = d
        sushis.append ( ( t , d ) )
    sushis.sort ( key = lambda s1 , s2 : s2.d )
    extras = [ ]
    types = { }
    type_count = 0
    deliciousness = 0
    for s in sushis [ : K ] :
        if s.t not in types :
            types [ s.t ] = True
            type_count += 1
        else :
            extras.append ( s )
        deliciousness += s.d
    satisfaction = type_count * type_count + deliciousness
    for s in sushis [ K : ] :
        if s.t not in types :
            types [ s.t ] = True
            type_count += 1
            deliciousness -= extras [ - 1 ].d
            deliciousness += s.d
            extras.pop ( )
            satisfaction = max ( satisfaction , type_count * type_count + deliciousness )
    print ( satisfaction )
