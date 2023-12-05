def import __main__
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = sc.readline ( ).split ( '' , 0 )
        at = ( 'a' , 't' , 'c' , 'o' , 'd' , 'e' , 'r' )
        b = sc.readline ( ).split ( '' , 0 )
        po = True
        for i in a :
            if i not in b :
                if i == '@' :
                    popo = False
                    for j in at :
                        if j in b :
                            popo = True
                    if not popo :
                        po = False
                        break
                elif i == '@' :
                    popo = False
                    for j in at :
                        if j in a :
                            popo = True
                    if not popo :
                        po = False
                        break
                else :
                    po = False
                    break
        print ( ( po , 'You can win' ) )
