def codejam ( ) :
    import os
    import sys
    class Task ( object ) :
        def __init__ ( self ) :
            self.name = self.name
        def run_one ( self , input , output ) :
            with open ( input , 'r' ) as infile :
                with open ( output , 'w' ) as outfile :
                    tests_count = len ( infile )
                    infile.readline ( )
                    for test in range ( 1 , tests_count + 1 ) :
                        print ( 'solving %d' % test )
                        outfile.write ( 'Case #%d: ' % test )
                        self.run_one ( infile , outfile )
                        outfile.flush ( )
        def run_console ( self , task ) :
            task.run ( sys.stdin , sys.stdout )
        def run_small ( self , num ) :
            self.run_files ( self , os.path.join ( './%s-small-attempt%d.in' % ( self.name , num ) , './%s-small-attempt%d.out' % ( self.name , num ) ) )
        def run_large ( self , num ) :
            self.run_files ( self , os.path.join ( './%s-large.in' % ( self.name , num ) , './%s-large.out' % ( self.name , num ) ) )
    def run_files ( self , input , output ) :
        with open ( input , 'r' ) as infile :
            with open ( output , 'w' ) as outfile :
                task.run ( infile , outfile )
