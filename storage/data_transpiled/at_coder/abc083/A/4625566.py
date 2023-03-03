def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            scn = sys.stdin
            A , B , C , D = scn.read ( ).split ( ' ' )
            if A + B > C + D :
                ans = 'Left'
            elif A + B == C + D :
                ans = 'Balanced'
            else :
                ans = 'Right'
            print ( ans )
    return Main
