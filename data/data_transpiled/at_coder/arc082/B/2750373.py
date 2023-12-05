def _import ( ) :
    from sys import stdin
    from .hexversion import hexversion
    class Main ( object ) :
        @ staticmethod
        def read ( ) :
            def __next__ ( self ) :
                self.scanner = BetterScanner ( sys.stdin )
                n = self.scanner.nextInt ( )
                num = 0
                nums = [ ]
                for i in range ( n ) :
                    p = ord ( i ) - 1
                    if i == p :
                        num += 1
                    else :
                        if num > 0 :
                            nums.append ( num )
                            num = 0
                if num > 0 :
                    nums.append ( num )
                res = 0
                for i in nums :
                    res += ( i + 1 ) / 2
                print ( res )
            return res
        def main ( ) :
            class Main ( object ) :
                def __init__ ( self ) :
                    self.stream = sys.stdin
                def read ( self ) :
                    self.stream.read ( )
                def update_buffer ( self ) :
                    if self.pointer >= self.new_pos :
                        self.pointer = 0
                        try :
                            self.new_pos = self.stream.read ( self.new_pos )
                        except IOError as exception :
                            traceback.print_exc ( )
                        return self.new_pos > 0
                    else :
                        return True
                def readline ( self ) :
                    if self.pointer == self.new_pos :
                        self.pointer = 0
                        try :
                            self.new_pos = self.stream.read ( self.new_pos )
                        except IOError as exception :
                            traceback.print_exc ( )
                        return self.new_pos > 0
                    else :
                        return False
                def readline ( self ) :
                    self.stream.read ( self.new_pos )
            def readline ( self ) :
                if self.pointer == 0 :
                    self.pointer = 0
                    try :
                        self.new_pos = self.stream.read ( self.new_pos )
                    except IOError as exception :
                        traceback.print_exc ( )
                    return False
                else :
                    return self.new_pos
        return Main
