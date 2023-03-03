def _import ( ) :
    from sympy import symbols
    from sympy.core import S
    class Main ( Basic ) :
        def doit ( self ) :
            with open ( "../../../api/sympy/polys/rootoftools/rootoftools.md" ) as sc :
                for n , data in enumerate ( sc.readlines ( ) ) :
                    count = 0
                    now = 0
                    left , right = 0 , 0
                    while True :
                        if left >= n :
                            break
                        while right < n :
                            res = now ^ data [ right ]
                            res2 = now | data [ right ]
                            if res != res2 :
                                break
                            now = now ^ data [ right ]
                            right += 1
                        count += right - left
                        now = now ^ ( now & data [ left ] )
                        left += 1
                    print ( count )
        def debug ( * x ) :
            print ( "debug = " , repr ( x ) )
    def doit ( ) :
        return Basic ( * [ S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One / S.One.S.One / S.One / S.One.S.One / S.One.S , debug )
    doit ( )
