def import _main
class Main ( object ) :
    def __init__ ( self , a , b ) :
        self.a = a
        self.b = b
        self.a_to_pos = { }
        self.ban = { }
        self.used = set ( )
        self.que = deque ( )
        def dfs ( v ) :
            res = 1
            if self.a [ v ] in self.used :
                return res
            self.used.add ( self.a [ v ] )
            for pos in self.a_to_pos [ self.a [ v ] ] :
                if not self.ban [ pos ] :
                    self.que.append ( pos )
                    self.ban [ pos ] = True
            while not self.que.empty ( ) :
                res += self.dfs ( self.que.popleft ( ) )
            return res
        def main ( self ) :
            sc = _main ( self )
            n = sc.__next__ ( )
            a = [ int ( sc.__next__ ( ) ) for _ in range ( n + 1 ) ]
            b = [ int ( sc.__next__ ( ) ) for _ in range ( n + 1 ) ]
            a [ n ] ^= a [ n ]
            for i in range ( n + 1 ) :
                b [ i ] = int ( sc.__next__ ( ) )
                b [ n ] ^= b [ n ]
            aa = [ ]
            bb = [ ]
            for i in range ( 0 , n ) :
                aa.append ( a [ i ] )
            for i in range ( 0 , n ) :
                bb.append ( b [ i ] )
            aa.sort ( )
            bb.sort ( )
            for i in range ( 0 , n ) :
                if aa [ i ] != bb [ i ] :
                    print ( - 1 )
                    return
            self.ban = [ ]
            for i in range ( 0 , n ) :
                if i < n and self.ban [ i ] :
                    continue
                if self.a_to_pos [ i ] in a :
                    a [ i ] = [ ]
return Main
