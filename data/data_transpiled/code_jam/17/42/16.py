def import __cando_do
class B ( object ) :
    def __init__ ( self , arg ) :
        self.arg = arg
    def run ( self ) :
        self.TT = int ( self.arg )
        for ii in range ( 1 , self.TT + 1 ) :
            N , C , M = self.args
            COUNT = [ 0 ] * C + 1
            coast = [ 0 ] * N + 1
            for pos , buyer in self.args :
                COUNT [ buyer ] += 1
                coast [ pos ] += 1
            min = 0
            for i in COUNT :
                if i > min :
                    min = i
            min = max ( min , coast [ 1 ] )
            max = M
            while min < max :
                piv = ( min + max ) / 2
                promotions = __cando_do ( coast , piv )
                if promotions >= 0 :
                    if max == piv :
                        sys.stderr.write ( "whoops\n" )
                    max = piv
                else :
                    min = piv + 1
            if min != max :
                sys.stderr.write ( "never\n" )
            ans = __cando_do ( coast , max )
            print ( "Case #%d: %d %d\n" % ( ii , max , ans ) )
    def can_do ( coast , R ) :
        slots_available = 0
        promotions = 0
        for i in coast [ 1 : ] :
            if i > R :
                if i - R > slots_available :
                    return - 1
                p = ( i - R )
                slots_available -= p
                promotions += p
            elif i == R :
                pass
            else :
                slots_available += R - i
        return promotions
