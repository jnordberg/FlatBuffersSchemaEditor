/*
 * generated by Xtext
 */
package maxim.zaks.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class FlatBuffersAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("maxim/zaks/parser/antlr/internal/InternalFlatBuffers.tokens");
	}
}