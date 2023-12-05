def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.moji = ''
            self.count = [ 0 ] * 11
            for i in range ( 10 ) :
                self.moji [ i ] = sys.stdin.read ( 1 )
                if self.moji [ i ] == '\n' :
                    break
    for i , j in enumerate ( moji ) :
        while i in [ 'A' , 'C' , 'G' , 'T' ] :
            self.count [ j ] += 1
            i += 1
    max = 0
    for i in count :
        if max < i :
            max = i
    print ( max )
