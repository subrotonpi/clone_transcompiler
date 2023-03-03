def _import ( ) :
    from io import IO
    class Main ( IO ) :
        def __init__ ( self ) :
            io = IO ( )
            def readline ( self ) :
                n = io.__next__ ( )
                ans = 0
                v = 0
                for i in range ( 2 , n + 1 ) :
                    print ( "? %d %d\n" % ( 1 , i ) )
                a = [ ]
                for i in range ( n ) :
                    a.append ( next ( self ) )
                return a
            def array_long ( n ) :
                a = [ ]
                for i in range ( n ) :
                    a.append ( next ( self ) )
                return a
            def array_float ( n ) :
                a = [ ]
                for i in range ( n ) :
                    a.append ( next ( self ) )
                return a
            def array_int ( n ) :
                a = [ ]
                for i in range ( 1 , n + 1 ) :
                    a.append ( next ( self ) )
                return a
            for i in range ( n ) :
                if i == v :
                    continue
                print ( "? %d %d\n" % ( v , i ) )
            tmp = [ ]
            for i in range ( n ) :
                a.append ( next ( self ) )
            return a
        def charmap ( n , m ) :
            a = [ ]
            for i in range ( m ) :
                a.append ( next ( self ) )
            return a
        def write ( self , source ) :
            self.write ( source )
            try :
                self.write ( source )
            except StopIteration :
                pass
            if self.write ( '\n' ) :
                self.write ( '\n' )
            return self.write
        def has_next_line ( self ) :
            self.write ( '\n' )
            return self.write
        def has_next_line ( self ) :
            self.write ( '\n' )
            return self.write
    return Main
