def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.count ( )
        b , w = [ ] , [ ]
        sk = [ ]
        nama = [ ]
        for i in range ( 2 * n ) :
            ch = sc.next ( ) [ 0 ]
            ind = sc.index ( ) - 1
            if ch == 'W' :
                w.append ( i )
                sk.append ( 0 )
                nama.append ( ind )
            else :
                b.append ( i )
                sk.append ( 1 )
                nama.append ( ind )
    def __init__ ( self ) :
        self.dp = [ ]
        for i in range ( 2 * n ) :
            num = nama [ 0 ]
            if self.sk [ 0 ] == 0 :
                if i <= num :
                    self.ruiw [ 0 ] [ i ] = 1
            else :
                if i <= num :
                    self.ruib [ 0 ] [ i ] = 1
        for i in range ( 1 , 2 * n ) :
            num = nama [ i ]
            if self.sk [ i ] == 0 :
                for j in range ( n ) :
                    if j <= num :
                        self.ruiw [ i ] [ j ] = self.ruiw [ i - 1 ] [ j ] + 1
                    else :
                        self.ruiw [ i ] [ j ] = self.ruiw [ i - 1 ] [ j ]
                    self.ruib [ i ] [ j ] = self.ruib [ i - 1 ] [ j ]
            else :
                for j in range ( n ) :
                    if j <= num :
                        self.ruib [ i ] [ j ] = self.ruib [ i - 1 ] [ j ] + 1
                    else :
                        self.ruib [ i ] [ j ] = self.ruib [ i - 1 ] [ j ]
                    self.ruiw [ i ] [ j ] = self.ruiw [ i - 1 ] [ j ]
