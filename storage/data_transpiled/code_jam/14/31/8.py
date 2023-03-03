def codejam.r1c ( ) :
    import codejam.task
    import codejam.file
    import codejam.file
    import codejam.file
    import codejam.file
    import codejam.file
    import codejam.file
    class A ( codejam.file ) :
        def __init__ ( self ) :
            self.run_large ( [ ] )
        def run_one ( self , input , output ) :
            line = input.readline ( )
            p , q = map ( int , line.split ( "/" ) )
            gcd = codejam.file.gcd ( p , q ) [ 0 ]
            p , q = divmod ( p , gcd )
            qq = q
            step = 0
            while qq % 2 == 0 :
                qq //= 2
                step += 1
            if qq != 1 or step > 40 :
                output.write ( "impossible" )
                return
            cur_min = p
            for ans in range ( 1 , 40 ) :
                cur_min *= 2
                if cur_min >= q :
                    output.write ( ans )
                    return
            raise Exception
