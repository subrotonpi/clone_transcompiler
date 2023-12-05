def _import ( ) :
    from sys import stdin
    from .py3compat import PY3
    class Main ( object ) :
        def __init__ ( self , stream ) :
            self.stream = stream
            i = ord ( stream.read ( 1 ) )
            o = ord ( stream.read ( 1 ) )
            t = ord ( stream.read ( 1 ) )
            j = ord ( stream.read ( 1 ) )
            l = ord ( stream.read ( 1 ) )
            s = ord ( stream.read ( 1 ) )
            z = ord ( stream.read ( 1 ) )
            ans = 0
            ans += o
            ans1 = 0
            ans2 = 0
            ans1 += ( i // 2 ) * 2
            ans1 += ( j // 2 ) * 2
            ans1 += ( l // 2 ) * 2
            if i >= 1 and j >= 1 and l >= 1 :
                ans2 += 3
                i -= 1
                j -= 1
                l -= 1
                ans2 += ( i // 2 ) * 2
                ans2 += ( j // 2 ) * 2
                ans2 += ( l // 2 ) * 2
            print ( ans , max ( ans1 , ans2 ) )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            self.stream = stream
            self.stream = stream
            self.ptr = stream.tell ( )
            self.stream.seek ( 0 )
            self.stream.seek ( 0 )
            self.stream.seek ( 0 )
            self.stream.read ( 1 )
        def readline ( self ) :
            if self.stream.read ( 1 ) == '-' :
                minus = True
            else :
                self.stream.seek ( 0 )
            return self.stream.read ( 1 )
        def write ( self , s ) :
            self.stream.write ( s )
            self.stream.write ( s )
            self.stream.seek ( 0 )
            return self.stream.read ( 1 )
        def readline ( self ) :
            if self.stream.read ( 1 ) == '-' :
                minus = True
            else :
                minus = False
    return Main ( )
