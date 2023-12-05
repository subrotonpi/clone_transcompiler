def y2010.round3.c ; import sys
class C ( object ) :
    def __init__ ( self ) :
        self.case = 1
        name = [ 'sample' , 'small' , 'large' ]
        sys.stdin = self.__stdin__.read ( name [ self.case ] + '.stdin' )
        self._in = self.__stdin__.read ( )
        _t = self._in
        for _l in range ( 1 , _t + 1 ) :
            x = [ ]
            min = 3000001
            c = self._in.count ( )
            for i in range ( c ) :
                p = self._in.count ( ) + 1500000
                v = self._in.count ( )
                x.append ( v )
                min = min ( min , p )
            times = 0
            while True :
                finish = True
                for i in range ( min , len ( x ) ) :
                    if x [ i ] > 1 :
                        finish = False
                        x [ i - 1 ] += 1
                        x [ i + 1 ] += 1
                        x [ i ] -= 2
                        times += 1
                        if x [ i - 1 ] > 1 :
                            min = i - 1
                        break
                if finish : break
            ans = '' * times
            print ( 'Case #%d: %s\n' % ( _l , ans ) )
