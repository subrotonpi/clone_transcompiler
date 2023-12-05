def _import ( ) :
    import threading
    import threading
    class Solution ( threading.Thread ) :
        def __init__ ( self ) :
            self.test_num = 0
            def is_vowel ( char ) :
                return char in 'aeiou'
            for th in threading.Thread ( ) :
                if th.name.lower ( ) in 'aeiou' :
                    self.thread [ th.name.lower ( ) ].start ( )
        def solve ( ) :
            for i in range ( IO.test_count ) :
                yield i
    def main ( ) :
        IO.init ( 'A-large.in' , 'out.txt' )
        solve ( )
        IO.print ( )
    def write ( ) :
        IO.write ( )
    def set_test_count ( ) :
        IO.test_count = 0
    def set_test_counter ( ) :
        IO.test_counter = 0
    def stdin ( ) :
        IO.stdin ( )
        IO.stdout ( )
        IO.write ( )
    def output ( ) :
        IO.lock = threading.Lock ( )
        set_test_count ( IO.test_count )
    def init ( fin , fout ) :
        IO.test_count = 0
        output = [ ]
    def set_test_count ( ) :
        IO.test_count = test_count
        output = [ ]
    def add ( test_num , ans ) :
        output.append ( ans )
    def next_test ( ) :
        return 1
    def write ( ) :
        for t in range ( test_count ) :
            print ( 'Case #%d: %s' % ( t + 1 , output [ t ] ) , file = sys.stderr )
    def solve ( ) :
        for i in range ( IO.test_count ) :
            if i in IO.thread :
                print ( 'Case #%d: %s' % ( i , i ) , file = sys.stderr )
