def _ _ main _ _ ( ) : return True
class C ( object ) :
    def __init__ ( self , k , s ) :
        self.k = k
        self.s = s
    def __eq__ ( self , o ) : return self.k == o or self.__class__ != type
    key = type ( self )
    def __hash__ ( self ) : return self.k == k and callable ( self.k )
    def __repr__ ( self ) : return '%s:%d' % ( self.k , self.s )
