def qround ( ) :
    import sys
    class Event ( object ) :
        DEPART = 1
        ARRIVE = 0
        def __init__ ( self , k , t ) :
            self.kind = k
            self.time = t
        def __lt__ ( self , other ) :
            if self.time == other.time :
                return self.kind - other.kind
            return self.time - other.time
    class B ( object ) :
        def to_i ( self , str ) :
            return int ( str [ 0 : 2 ] ) * 60 + int ( str [ 3 : ] )
        def main ( self ) :
            sc = sys.stdin
            N = sc.readline ( ).strip ( )
            for i in range ( 1 , N + 1 ) :
                T , na , nb = sc.readline ( ).strip ( ).split ( )
                ea = [ ]
                eb = [ ]
                for j in range ( na ) :
                    depart , arrive = to_i ( sc.readline ( ).strip ( ) )
                    ea.append ( ( 'DEPART' , depart ) )
                    eb.append ( ( 'ARRIVE' , arrive + T ) )
                for j in range ( nb ) :
                    depart , arrive = to_i ( sc.readline ( ).strip ( ) )
                    eb.append ( ( 'DEPART' , depart ) )
                    ea.append ( ( 'ARRIVE' , arrive + T ) )
                ea.sort ( )
                eb.sort ( )
                ra = number ( ea )
                rb = number ( eb )
                sys.stdout.write ( "Case #%d: %d %d\n" % ( i , ra , rb ) )
    number ( B ( ) )
    return number ( B ( ) )
