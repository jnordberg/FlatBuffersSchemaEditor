/*
 * generated by Xtext
 */
package maxim.zaks.serializer;

import com.google.inject.Inject;
import java.util.List;
import maxim.zaks.services.FlatBuffersGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class FlatBuffersSyntacticSequencer extends AbstractSyntacticSequencer {

	protected FlatBuffersGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Enum_CommaKeyword_8_q;
	protected AbstractElementAlias match_Union_CommaKeyword_5_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (FlatBuffersGrammarAccess) access;
		match_Enum_CommaKeyword_8_q = new TokenAlias(false, true, grammarAccess.getEnumAccess().getCommaKeyword_8());
		match_Union_CommaKeyword_5_q = new TokenAlias(false, true, grammarAccess.getUnionAccess().getCommaKeyword_5());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getDEPRECTED_ATTRIBUTERule())
			return getDEPRECTED_ATTRIBUTEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getHASH_ATTRIBUTERule())
			return getHASH_ATTRIBUTEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getID_ATTRIBUTERule())
			return getID_ATTRIBUTEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKEY_ATTRIBUTERule())
			return getKEY_ATTRIBUTEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getREQUIRED_ATTRIBUTERule())
			return getREQUIRED_ATTRIBUTEToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal DEPRECTED_ATTRIBUTE:
	 * 	'deprecated'
	 * ;
	 */
	protected String getDEPRECTED_ATTRIBUTEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "deprecated";
	}
	
	/**
	 * terminal HASH_ATTRIBUTE:
	 * 	'hash'
	 * ;
	 */
	protected String getHASH_ATTRIBUTEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "hash";
	}
	
	/**
	 * terminal ID_ATTRIBUTE:
	 * 	'id'
	 * ;
	 */
	protected String getID_ATTRIBUTEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "id";
	}
	
	/**
	 * terminal KEY_ATTRIBUTE:
	 * 	'key'
	 * ;
	 */
	protected String getKEY_ATTRIBUTEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "key";
	}
	
	/**
	 * terminal REQUIRED_ATTRIBUTE:
	 * 	'required'
	 * ;
	 */
	protected String getREQUIRED_ATTRIBUTEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "required";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Enum_CommaKeyword_8_q.equals(syntax))
				emit_Enum_CommaKeyword_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Union_CommaKeyword_5_q.equals(syntax))
				emit_Union_CommaKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     enumCases+=EnumCase (ambiguity) '}' (rule end)
	 */
	protected void emit_Enum_CommaKeyword_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     unionCases+=[Table|ID] (ambiguity) '}' (rule end)
	 */
	protected void emit_Union_CommaKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
