def import __main__
class Main ( object ) :
    def __init__ ( self ) :
        sc = __main__
        s = sc.split ( )
        t = sc.split ( )
        WILD_CARD = "atcoder@"
        win = True
        for i in range ( len ( s ) ) :
            if not win :
                break
            if s [ i ] == "@" and "%s" % t [ i ] not in WILD_CARD :
                win = False
            elif t [ i ] == "@" and "%s" % s [ i ] not in WILD_CARD :
                win = False
            elif s [ i ] != t [ i ] and s [ i ] != "@" and t [ i ] != "@" :
                win = False
        if win :
            self.__main__.append ( "You can win" )
        else :
            self.__main__.append ( "You will lose" )
