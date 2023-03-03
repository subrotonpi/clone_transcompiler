def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            s = sc.readline ( )
            ans = ""
            for ss in s.split ( ) :
                if ss == "Left" :
                    ans += "< "
                elif ss == "Right" :
                    ans += "> "
                else :
                    ans += "A "
            print ( ans.strip ( ) )
    return Main
