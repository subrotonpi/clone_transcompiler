def import _hash_map
class Main ( object ) :
    def __init__ ( self ) :
        self.n = n
        self.map = { }
        self.memo = [ ]
        for i in range ( n - 1 ) :
            a , b , c = _hash_map.get ( self.n , [ ] )
            tmp = self.map.get ( a )
            if tmp :
                tmp.append ( ( b , c ) )
            else :
                tmp1 = [ ( b , c ) ]
                self.map [ a ] = tmp1
            tmp = self.map.get ( b )
            if tmp :
                tmp.append ( ( a , c ) )
            else :
                tmp1 = [ ( a , c ) ]
                self.map [ b ] = tmp1
        self.Q = len ( self.map )
        self.k = len ( self.map )
        q = deque ( [ k ] )
        while not q.empty ( ) :
            c = q.popleft ( )
            for next in self.map [ c ] :
                if self.memo [ next.a ] :
                    continue
                self.memo [ next.a ] = self.memo [ c ] + next.b
                q.append ( next.a )
        for i in range ( self.Q ) :
            a , b = _hash_map.get ( self.a , self.b )
            print ( self.memo [ a ] , self.memo [ b ] )
class Path ( object ) :
    def __init__ ( self , a , b ) :
        self.a = a
        self.b = b
    def __eq__ ( self , other ) :
        if self == other : return True
        if not isinstance ( other , type ) or self.__class__ != other.__class__ : return False
        path = self.a
        self.b = b
        self.a = a
        self.b = b
        self.memo [ a ] = self.memo [ b ]
return Main
