def import import _sys , MOD
class Main ( object ) :
    def __init__ ( self ) :
        self.MOD = 1000000007L
    def __call__ ( self , * args ) :
        sc = _sys.stdin.read ( )
        h , w , k = sc.regs [ 0 ]
        if w == 1 :
            print ( 1 )
            return
        lst = [ [ ] ]
        b = [ ]
        for i in range ( w - 1 ) :
            tlist = [ ]
            for arr in lst :
                if i == 0 or not arr [ i - 1 ] :
                    tmp = arr.copy ( )
                    tmp [ i ] = True
                    tlist.append ( tmp )
            lst.extend ( tlist )
        count = [ [ 1 ] * ( h + 1 ) ]
        for i in range ( 1 , h + 1 ) :
            for j in range ( w ) :
                stay = left = right = 0
                for arr in lst :
                    if j != 0 and arr [ j - 1 ] :
                        left += 1
                    if j != w - 1 and arr [ j ] :
                        right += 1
                    if j != 0 and j != w - 1 :
                        if not arr [ j - 1 ] and not arr [ j ] :
                            stay += 1
                    elif j == 0 :
                        if not arr [ j ] :
                            stay += 1
                    elif j == w - 1 :
                        if not arr [ j - 1 ] :
                            stay += 1
                count [ j ] [ i ] += count [ j ] [ i - 1 ] * stay
                if j != 0 :
                    count [ j ] [ i ] += count [ j - 1 ] [ i - 1 ] * left
                if j != w - 1 :
                    count [ j ] [ i ] += count [ j + 1 ] [ i - 1 ] * right
                count [ j ] [ i ] %= MOD
return Main
