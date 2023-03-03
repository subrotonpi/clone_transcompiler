def main ( ) :
    import sys
    import random
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.head = head
            self.next = next
            self.to = head
            self.head = head
        def dfs ( v , p ) :
            ret = 0
            for e in self.head [ v ] :
                u = self.to [ e ]
                if u != p :
                    ret ^= dfs ( u , v ) + 1
            return ret
        def submit ( self ) :
            n = randint ( 1 , n )
            self.head = [ - 1 ] * n
            self.next = [ 0 ] * 2 ** n
            self.to = [ 0 ] * 2 ** n
            for i in range ( n - 1 ) :
                v = randint ( 0 , n - 1 )
                u = randint ( 0 , n - 1 )
                self.add_edge ( v , u , 2 * i )
                self.add_edge ( u , v , 2 * i + 1 )
            ret = self.dfs ( 0 , - 1 )
            out.write ( 'Bob' if ret == 0 else 'Alice' )
        def pre_calc ( self ) :
            pass
        def stress ( self ) :
            pass
        def test ( self ) :
            pass
    def main ( ) :
        f = open ( sys.argv [ 1 ] , 'r' )
        out = open ( sys.argv [ 2 ] , 'w' )
        self.pre_calc ( )
        submit ( )
        out.close ( )
    rng = random.Random ( )
    def rand ( l , r ) :
        return l + rng.randint ( r - l + 1 )
    def main ( ) :
        return Main ( )
    f.readline ( )
    f.close ( )
    f.readline ( )
    f.readline ( )
    f.readline ( )
    f.readline ( )
    f.readline ( )
    f.readline ( )
    f.readline ( )
    f.readline ( )
    f.readline ( )
    f.readline ( )
    f.readline ( )
    f.readline ( )
    f.readline ( )
    f.readline ( )
    f.readline ( )
    f.close ( )
