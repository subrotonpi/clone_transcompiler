def _import ( ) :
    from io import BytesIO
    from io import BytesIO
    from io import BytesIO
    from io import BytesIO
    from io import BytesIO
    from io import BytesIO
    class Main ( object ) :
        def __init__ ( self , stream ) :
            stream = BytesIO ( )
            self.stream = stream
            self.seek ( 0 )
            self.read ( 1 )
        def isspace ( self ) :
            return self.read ( 33 )
        def read ( self ) :
            return self.read ( )
        def write ( self , buf ) :
            if len ( buf ) == 1 :
                stream.write ( buf )
                return
            if len ( buf [ 1 : ].replace ( '9' , '' ) ) == 0 :
                x = 0
                for i in buf [ 1 : ] :
                    x += int ( i )
                stream.write ( x )
                return
            if buf [ 1 ] != '9' :
                x = 0
                if buf [ 0 ] != '1' :
                    x += u'-'
                for i in buf [ 1 : ] :
                    x += 9
                stream.write ( x )
                return
            a = [ u'' ]
            x = - 1
            for i in buf [ 1 : ] :
                if i != '9' :
                    for j in range ( x ) :
                        a.append ( 9 )
                    a.append ( 8 )
                    for j in range ( i , len ( buf ) ) :
                        a.append ( 9 )
                else :
                    x += 1
            r = 0
            for m in a :
                r += m
            stream.write ( r )
    class InputStream ( BytesIO ) :
        def __init__ ( self , stream ) :
            self.stream = stream
            self.seek ( 0 )
            self.read ( 1024 )
        def read ( self ) :
            for i in range ( 1024 ) :
                self.read ( )
        def write ( self , buf ) :
            self.read ( )
    return InputStream ( )
