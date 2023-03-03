def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.arr = sys.stdin.read ( ).decode ( 'utf-8' )
    arr = [ ]
    s = [ ]
    prev = '1'
    count = 1
    for c in arr :
        if prev == '1' :
            prev = c
        elif prev == c :
            count += 1
        else :
            s.append ( prev + str ( count ) )
            prev = c
            count = 1
    s.append ( prev + str ( count ) )
    print ( s )
