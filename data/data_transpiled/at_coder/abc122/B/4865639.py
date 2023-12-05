def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.main = Main ( )
        def start ( self ) :
            sc = sys.stdin.readline ( )
            data = sc.decode ( )
            letters = data.split ( '' )
            max = 0
            for letter in letters :
                num = count_length ( letter , letter )
                if num > max :
                    max = num
            print ( max )
        def count_length ( self , index ) :
            count = 0
            for letter in index :
                if letter in [ 'A' , 'C' , 'T' , 'G' ] :
                    count += 1
                else :
                    return count
            return count
    return Main ( )
