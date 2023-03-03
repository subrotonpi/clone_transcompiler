def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        s = sc.next ( )
        ans = 'No'
        if 'N' in s and 'S' in s and 'E' in s and 'W' in s :
            ans = 'Yes'
        elif 'N' not in s and 'S' not in s and 'E' not in s and 'W' in s :
            ans = 'Yes'
        elif 'N' in s and 'S' not in s and 'E' not in s and 'W' in s :
            ans = 'Yes'
        print ( ans )
