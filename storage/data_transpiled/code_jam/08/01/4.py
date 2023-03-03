def library ( ) :
    import collections
    class Translation ( object ) :
        a = collections.defaultdict ( list )
        b = collections.defaultdict ( list )
        next = 0
        def add ( self , item ) :
            if item in a :
                return a [ item ]
            a [ item ].append ( next )
            b [ next ].append ( item )
            next += 1
            return next - 1
        def get ( self , item ) :
            if item in a :
                return a [ item ]
            return - 1
        def get ( self , index ) :
            if index in b :
                return b [ index ]
            return None
    return Translation ( )
