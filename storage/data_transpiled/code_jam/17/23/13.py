def _ ( a , b ) :
    import sys
    if a == - 1 and b == - 1 :
        return - 1
    if a == - 1 :
        return b
    if b == - 1 :
        return a
    def main ( ) :
        with open ( '/dev/tty' , 'r' ) as f :
            num_cases = len ( f.readlines ( ) )
            for q in range ( 1 , num_cases + 1 ) :
                start = f.readline ( ).readline ( ).strip ( )
                end = f.readline ( ).strip ( )
                print ( ' %.9f' % ( legs [ start ] [ end - 1 ] ) )
    class Pair :
        def __init__ ( self , a , b ) :
            self.a = a
            self.b = b
        def __eq__ ( self , other ) :
            if self.a is None or self.a != self.b : return False
            pair = self.a
            if self.b is None : return False
            if self.b is pair : return False
            return self.b
        def __hash__ ( self ) :
            return self.a
        def __eq__ ( self , other ) :
            if self.a is None or ( self.b is pair.a and self.b is pair.b ) : return False
            return self.b is pair.b
        def __hash__ ( self ) :
            return self.a
        def __eq__ ( self , other ) :
            if other is None or self.a != other.a : return False
            return self.b
        def __hash__ ( self ) :
            return self.a
        def __eq__ ( self , other ) :
            if other is None or self.a != other.a : return False
            return self.b
        def __hash__ ( self ) :
            return self.a
        def __eq__ ( self , other ) :
            if other is None or self.a != other.a : return False
            return self.b
        def __hash__ ( self ) :
            return self.a
        def __eq__ ( self , other ) :
            return self.b
        def __hash__ ( self ) :
            return self.a
